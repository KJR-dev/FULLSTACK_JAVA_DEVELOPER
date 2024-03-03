package com.otz;

import java.sql.*;
import java.util.*;


//Jdbc connection code
public class UserDao {
	Connection con=null;
	public Connection getconnection()
	{	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_user","root","Jitu@135050");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
	
	//save users data
	public int saveUser(UserBin data) {
		int status=0;
		try {
			con=this.getconnection();
			String sql="insert into user (name,email,password,country) values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,data.getName());
			ps.setString(2,data.getEmail());
			ps.setString(3,data.getPassword());
			ps.setString(4,data.getCountry());
			status = ps.executeUpdate();
			con.close();
			}catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	//viewusers code
	public List<UserBin> getUsers(){
			ArrayList<UserBin> userslist= new ArrayList<UserBin>();
			try {
				con=this.getconnection();
				String sql="select * from user";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					UserBin user=new UserBin();
					user.setId(rs.getInt("id"));
					user.setName(rs.getString("name"));
					user.setEmail(rs.getString("email"));
					user.setPassword(rs.getString("password"));
					user.setCountry(rs.getString("country"));
					userslist.add(user);
				}con.close();				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			return userslist;
	}
	
	public UserBin getUser(int Id) {
			UserBin user=new UserBin();
		try {
			con=this.getconnection();
			String sql="select * from user where id = ?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, Id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setCountry(rs.getString("country"));
			}con.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return user;
	}
	
	public int updateUser(UserBin data) {
		int status=0;
		try {
			con=this.getconnection();
			String sql="update user set name=?, password=?, email=?, country=? where id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,data.getName());
			ps.setString(2,data.getEmail());
			ps.setString(3,data.getPassword());
			ps.setString(4,data.getCountry());
			ps.setInt(5,data.getId());
			status = ps.executeUpdate();
			con.close();
			}catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public int deleteUser(int id) {
		int status=0;
		try {
			con=this.getconnection();
			String sql="delete from user where id=?";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setInt(1, id);
			status=stmt.executeUpdate();
			con.close();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return status;
	}
	
}
