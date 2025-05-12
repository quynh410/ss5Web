package ra.com.dao;

import ra.com.model.Categories;
import ra.com.utils.ConnectionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoriesDAOImp implements CategoriesDAO {
    @Override
    public List<Categories> findAll() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Categories> listCategories = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call find_all_cate()}");
            ResultSet rs = callSt.executeQuery();
            listCategories = new ArrayList<>();
            while (rs.next()) {
                Categories catalog = new Categories();
                catalog.setCataId(rs.getInt("catalog_id"));
                catalog.setCataName(rs.getString("catalog_name"));
                catalog.setCataDescription(rs.getString("catalog_description"));
                catalog.setStatus(rs.getBoolean("catalog_status"));
                listCategories.add(catalog);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return listCategories;
    }

    @Override
    public boolean save(Categories catalog) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean result = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call save_catalog(?,?,?)}");
            callSt.setString(1, catalog.getCataName());
            callSt.setString(2, catalog.getCataDescription());
            callSt.setBoolean(3, catalog.isStatus());
            callSt.executeUpdate();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return result;
    }

    @Override
    public Categories findById(int cataId) {
        Connection conn = null;
        CallableStatement callSt = null;
        Categories catalog = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call find_catalog_by_id(?)}");
            callSt.setInt(1, cataId);
            ResultSet rs = callSt.executeQuery();
            catalog = new Categories();
            if (rs.next()) {
                catalog.setCataId(rs.getInt("catalog_id"));
                catalog.setCataName(rs.getString("catalog_name"));
                catalog.setCataDescription(rs.getString("catalog_description"));
                catalog.setStatus(rs.getBoolean("catalog_status"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return catalog;
    }

    @Override
    public boolean update(Categories catalog) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean result = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call update_cata(?,?,?,?)}");
            callSt.setInt(1, catalog.getCataId());
            callSt.setString(2, catalog.getCataName());
            callSt.setString(3, catalog.getCataDescription());
            callSt.setBoolean(4, catalog.isStatus());
            callSt.executeUpdate();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return result;
    }

    @Override
    public boolean delete(int catalogId) {
        Connection conn = null;
        CallableStatement callSt = null;
        boolean result = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call delete_catalog(?)}");
            callSt.setInt(1, catalogId);
            callSt.executeUpdate();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return result;
    }
}