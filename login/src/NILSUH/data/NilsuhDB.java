package data;
import java.sql.*;
import java.util.ArrayList;

import agriculture.*;


public class NilsuhDB {   
    
    //CLIENT

    public void addClient(Client client){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.100.4:3306/NILSUH","nilsuh", "hXmhxnfu5vaHqv8f");

            PreparedStatement stmt = conn.prepareStatement("insert into client(c_fname,c_lname,gender,address,email,telephone) values (?, ?, ?, ?, ?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
         
            String[] name= client.getName().split(" ");
        
            stmt.setString(1, name[0]);
            stmt.setString(2, name[1]);
            stmt.setString(3,(client.getGender()).name());
            stmt.setString(4, client.getAddress());
            stmt.setString(5, client.getEmail());
            stmt.setString(6, client.getPhoneNumber());
            stmt.executeUpdate();

            ResultSet rset = stmt.getGeneratedKeys();
            

            while(rset.next()){
                client.setIdNumber(rset.getInt(1));
            }

        }
        catch(SQLException ex) {
            ex.printStackTrace();
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Client> srchClient(String token) {
        ArrayList<Client> clist = new ArrayList<Client>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        
            Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.100.4:3306/NILSUH","nilsuh", "hXmhxnfu5vaHqv8f");

            Statement stmt = conn.createStatement();

            String strSelect = "SELECT * FROM client WHERE c_fname= '"+token+ "' or c_lname= '"+token+ "'or client_id= '" + token+"'";
            ResultSet rset = stmt.executeQuery(strSelect);

            while(rset.next()) {
                int client_id = rset.getInt("client_id");
                String fname = rset.getString("c_fname");
                String lname = rset.getString("c_lname");
                Gender gender = Gender.valueOf(rset.getString("gender"));
                String address = rset.getString("address");
                String email = rset.getString("email");
                String telephone = rset.getString("telephone");

                Client cl = new Client(fname+" "+lname, gender, address, email, telephone, "", client_id);
                clist.add(cl);

            }

        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clist;
    }

    public void deleteClient(String id) throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.100.4:3306/NILSUH","nilsuh", "hXmhxnfu5vaHqv8f");

            PreparedStatement stmt = conn.prepareStatement("DELETE FROM client WHERE client_id = ?");
            stmt.setString(1,id);
            stmt.executeUpdate(); 

            System.out.print(id + "deleted");
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateClient(String id,String token, String update) throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.100.4:3306/NILSUH","nilsuh", "hXmhxnfu5vaHqv8f");

        PreparedStatement stmt = conn.prepareStatement("UPDATE client SET " +token+ " = ? WHERE client_id = ?");
        //stmt.setString(1,token);
        stmt.setString(1, update);
        stmt.setString(2, id);
        stmt.executeUpdate();

        System.out.print(id + "updated");
    }



    //EMPLOYEE
    public void addEmployee(Employee emp){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.100.4:3306/NILSUH","nilsuh", "hXmhxnfu5vaHqv8f");
            PreparedStatement stmt = conn.prepareStatement("insert into employee(e_fname,e_lname,gender,address,email,telephone,login_status, position,start_date,end_date) values (?, ?, ?, ?, ?,?,?,?,?,?);", PreparedStatement.RETURN_GENERATED_KEYS);

            String[] name= emp.getName().split(" ");
            
            stmt.setString(1, name[0]);
            stmt.setString(2, name[1]);
            stmt.setString(3, (emp.getGender()).name());
            stmt.setString(4, emp.getAddress());
            stmt.setString(5, emp.getEmail());
            stmt.setString(6, emp.getPhoneNumber());
            stmt.setString(7, emp.getLoginStatus());
            stmt.setString(8, emp.getPosition());
            stmt.setDate(9, Date.valueOf(emp.getStartdate()));

            String str;
            if ((emp.getEnddate()==" ") || (emp.getEnddate()==null)){
                str = "2000-01-01";
            }
            else{
                str = emp.getEnddate();
            }

            stmt.setDate(10, Date.valueOf(str));
            stmt.executeUpdate();

            ResultSet rset = stmt.getGeneratedKeys();
            

            while(rset.next()){
                emp.setIdNumber(rset.getInt(1));
            }


        }
        catch(SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
    }


    public ArrayList<Employee> srchEmployee(String token) {
        ArrayList<Employee> emplist = new ArrayList<Employee>();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.100.4:3306/NILSUH","nilsuh", "hXmhxnfu5vaHqv8f");


            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM employee WHERE e_fname= ? or e_lname= ? or emp_id= ?");
            stmt.setString(1, token);
            stmt.setString(2, token);
            stmt.setString(3, token);
            ResultSet rset = stmt.executeQuery();

            while(rset.next()) {
                int emp_id = rset.getInt("emp_id");
                String fname = rset.getString("e_fname");
                String lname = rset.getString("e_lname");
                Gender gender = Gender.valueOf(rset.getString("gender"));
                String address = rset.getString("address");
                String email = rset.getString("email");
                String telephone = rset.getString("telephone");
                String login_stat = rset.getString("login_status");
                String position = rset.getString("position");
                String sdate = (rset.getDate("start_date")).toString();
                String edate = (rset.getDate("end_date")).toString();
                double hrs = rset.getDouble("hrs");

                Employee emp = new Employee(fname+" "+lname, gender, address, email, telephone,login_stat, position, sdate, edate);
                emp.setIdNumber(emp_id);
                emp.setHrs(hrs);
                emplist.add(emp);
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 

        return emplist;

    }

    public void deleteEmployee(String id) throws SQLException{

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.100.4:3306/NILSUH","nilsuh", "hXmhxnfu5vaHqv8f");

            PreparedStatement stmt = conn.prepareStatement("DELETE FROM employee WHERE emp_id = ?");
            stmt.setString(1,id);
            stmt.executeUpdate(); 

            System.out.print(id + "deleted");
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }         
    }

    public void updateEmployee(String id,String token, String update){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.100.4:3306/NILSUH","nilsuh", "hXmhxnfu5vaHqv8f");

            PreparedStatement stmt = conn.prepareStatement("UPDATE employee SET "+token+ "= ? WHERE emp_id = ?");
            stmt.setString(1, update);
            stmt.setString(2, id);
            stmt.executeUpdate();

            System.out.print(id + "updated");
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
    }

    public void addLogin(Employee manager){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.100.4:3306/NILSUH","nilsuh", "hXmhxnfu5vaHqv8f");

            PreparedStatement stmt = conn.prepareStatement("insert into manager values (?, ?, ?)");
         
        
            stmt.setInt(1, manager.getId());
            stmt.setString(2, manager.getUsername());
            stmt.setString(3, manager.getPassword());
            stmt.executeUpdate();

        }
        catch(SQLException ex) {
            ex.printStackTrace();
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    
    public void deleteLogin(String id) throws SQLException{

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.100.4:3306/NILSUH","nilsuh", "hXmhxnfu5vaHqv8f");

            PreparedStatement stmt = conn.prepareStatement("DELETE FROM manager WHERE emp_id = ?");
            stmt.setString(1,id);
            stmt.executeUpdate(); 

            System.out.print(id + "deleted");
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }         
    }

    public void updateLogin(String id,String token, String update){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.100.4:3306/NILSUH","nilsuh", "hXmhxnfu5vaHqv8f");

            PreparedStatement stmt = conn.prepareStatement("UPDATE login SET "+token+ "= ? WHERE emp_id = ?");
            stmt.setString(1, update);
            stmt.setString(2, id);
            stmt.executeUpdate();

            System.out.print(id + "updated");
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
    }

    public boolean srchLogin(String username, String password){
        boolean a=false;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.100.4:3306/NILSUH","nilsuh", "hXmhxnfu5vaHqv8f");

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM login WHERE username = ? AND password=?");

            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rset = stmt.executeQuery();

            if(rset.next()==false){
                a = false ;
            }
            else{
                a = true;
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 

        return a;
    }
    

    //BATCH
    public void addBatch(BatchInfo batch){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.100.4:3306/NILSUH","nilsuh", "hXmhxnfu5vaHqv8f");

            PreparedStatement stmt = conn.prepareStatement("insert into batch(entryDate, amount,mortality,remain,slaughter_date,feedCost,medicineCost) values (?, ?, ?, ?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);

            long curr = System.currentTimeMillis();
            Date sqlDate = new Date(curr);
            batch.setEntryDate(sqlDate.toString());
         
            stmt.setDate(1, sqlDate);            
            stmt.setInt(2, batch.getAmount());
            stmt.setInt(3, batch.getMortality());
            stmt.setInt(4, batch.getRemain());
            stmt.setDate(5, Date.valueOf(batch.getSlaughterDate()));
            stmt.setDouble(6, batch.getFeedCost());
            stmt.setDouble(7, batch.getMedicineCost());
                        
            stmt.executeUpdate();

            ResultSet rset = stmt.getGeneratedKeys();
            while(rset.next()){
                batch.setId(rset.getInt(1));
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
    }

    public void updateBatch(String id,String token, String update){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.100.4:3306/NILSUH","nilsuh", "hXmhxnfu5vaHqv8f");

            PreparedStatement stmt = conn.prepareStatement("UPDATE batch SET "+token+ "= ? WHERE batch_id = ?");
            stmt.setString(1, update);
            stmt.setString(2, id);
            stmt.executeUpdate();

            System.out.print(id + "updated");
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
    }

    public ArrayList<BatchInfo> srchBatchInfo(String token1, String token2) {
        ArrayList<BatchInfo> batchlist = new ArrayList<BatchInfo>();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.100.4:3306/NILSUH","nilsuh", "hXmhxnfu5vaHqv8f");


            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM batch WHERE entry_date ? BETWEEN ? AND ?");
            stmt.setString(1, token1);
            stmt.setString(2, token2);

            ResultSet rset = stmt.executeQuery();

            while(rset.next()) {
                int batchId = rset.getInt("batch_id");
                String entrydate = (rset.getDate("entry_date")).toString();
                int amt = rset.getInt("amount");
                int mort = rset.getInt("mortality");
                int remain = rset.getInt("mortality");
                String sdate = rset.getDate("slaughter_date").toString();
                Double fcost = rset.getDouble("feedCost");
                Double mcost = rset.getDouble("medicineCost");
                
                BatchInfo batch = new BatchInfo(mort, remain, amt, sdate, fcost, mcost);
                batch.setEntryDate(entrydate.toString());
                batch.setId(batchId);
                batchlist.add(batch);
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return batchlist;
    }


    //TRANSACTION
    public void addTransaction(Transaction trans ){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.100.4:3306/NILSUH","nilsuh", "hXmhxnfu5vaHqv8f");

            PreparedStatement stmt = conn.prepareStatement("insert into transactions(entry_date,quantity,qty_lb,amount,balance,trans_type,payment_type,purpose,source,destination,description,status,dateopen,dateclose) values (?, ?, ?, ?, ?,?,?,?,?,?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);

            long curr = System.currentTimeMillis();
            Date sqlDate = new Date(curr);
            trans.setEntryDate(sqlDate.toString());

            stmt.setDate(1, sqlDate);
            stmt.setInt(2, trans.getQuanNum());
            stmt.setDouble(3, trans.getQuanPound());
            stmt.setDouble(4, trans.getAmount());
            stmt.setDouble(5, trans.getRemain());
            stmt.setString(6, trans.getTransType());
            stmt.setString(7, trans.getPaymentType());
            stmt.setInt(8, trans.getPurpose());
            stmt.setString(9, trans.getSource());
            stmt.setString(10, trans.getDestination());
            stmt.setString(11, trans.getDescription());
            stmt.setInt(12, trans.getStatus());
            stmt.setDate(13, Date.valueOf(trans.getDateOpen()));
            
            String str;
            if ((trans.getDateClose()==" ") || (trans.getDateClose()==null)){
                str = "2000-01-01";
            }
            else{
                str = trans.getDateClose();
            }
            
            stmt.setDate(14, Date.valueOf(str));
            

            stmt.executeUpdate();

            ResultSet rset = stmt.getGeneratedKeys();
            
            while(rset.next()){
                trans.setTransNum(rset.getInt(1));
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
    }

    public void updateTransaction(String id,String token, String update){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.100.4:3306/NILSUH","nilsuh", "hXmhxnfu5vaHqv8f");

            PreparedStatement stmt = conn.prepareStatement("UPDATE transactions SET "+token+ "= ? WHERE trans_Num = ?");
            stmt.setString(1, update);
            stmt.setString(2, id);
            stmt.executeUpdate();

            System.out.print(id + "updated");
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
    }

    public ArrayList<Transaction> srchTransactions(String token1, String token2) {
        ArrayList<Transaction> translist = new ArrayList<Transaction>();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.100.4:3306/NILSUH","nilsuh", "hXmhxnfu5vaHqv8f");


            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM transactions WHERE entry_date ? BETWEEN ? AND ?");
            stmt.setString(1, token1);
            stmt.setString(2, token2);

            ResultSet rset = stmt.executeQuery();

            while(rset.next()) {
                int transNum = rset.getInt("trans_Num");
                String entrydate = (rset.getDate("entry_date")).toString();
                int qty = rset.getInt("quantity");
                Double qtylb = rset.getDouble("qty_lb");
                Double balance = rset.getDouble("balance");
                Double amt = rset.getDouble("amount");
                String trans = rset.getString("trans_type");
                String pay = rset.getString("payment_type");
                int purpose = rset.getInt("purpose");
                String src = rset.getString("source");
                String dest = rset.getString("destination");
                String desc = rset.getString("description");
                int status = rset.getInt("status");
                String odate = rset.getDate("dateopen").toString();
                String cdate = rset.getDate("dateclose").toString();

                Transaction tran = new Transaction(trans, pay, amt, balance, purpose, qty, qtylb, src, dest, desc, status, odate, cdate);
                tran.setTransNum(transNum);
                tran.setEntryDate(entrydate.toString());
                translist.add(tran);
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 

        return translist;

    }

 


    public static void main(String[] args) throws SQLException{
        NilsuhDB db = new NilsuhDB();
                
        System.out.print(db.srchLogin("hello", "good"));
        

        /*elist= db.srchEmployee("Lisa");
        for(int i=0; i<elist.size(); i++){
            System.out.println(elist.get(i).getName());
        }*/
        
        //db.updateEmployee("2", "gender", "FEMALE");
        //db.deleteEmployee("2");
    }
}