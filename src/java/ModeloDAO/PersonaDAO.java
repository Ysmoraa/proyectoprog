/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.Inter;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Brayan Mora
 */
public class PersonaDAO implements Inter{
 Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona p = new Persona();
    
    @Override
    public List listar() {
        ArrayList<Persona>list =new ArrayList<>();
         String sql="select * from persona";
         try {
            con= cn.getConnection();
            ps= con.prepareStatement(sql);
            rs= ps.executeQuery();
            while (rs.next()){
                Persona per = new Persona();
                per.setId(rs.getInt("ID"));
                per.setNombre(rs.getString("NOMBRE"));
                per.setScore(rs.getString("SCORE"));
                list.add(per);
                
            }
        } catch (Exception e) {
        }
         return list;
    }

    @Override
    public Persona list(int id) {
         String sql="select * from persona where ID="+id;
         try {
            con= cn.getConnection();
            ps= con.prepareStatement(sql);
            rs= ps.executeQuery();
            while (rs.next()){
                p.setId(rs.getInt("ID"));
                p.setNombre(rs.getString("NOMBRE"));
                p.setScore(rs.getString("SCORE"));
                
            }
        } catch (Exception e) {
        }
         return p;
    }

    @Override
    public boolean add(Persona per) {
        String sql="insert into persona(NOMBRE,SCORE)values('"+per.getNombre()+"','"+per.getScore()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        String sql="delete from persona where ID="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}
