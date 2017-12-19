package com.bidostar.dblibrary.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.bidostar.dblibrary.bean.CarBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CAR_BEAN".
*/
public class CarBeanDao extends AbstractDao<CarBean, Void> {

    public static final String TABLENAME = "CAR_BEAN";

    /**
     * Properties of entity CarBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Name = new Property(0, String.class, "name", false, "NAME");
        public final static Property CarId = new Property(1, int.class, "carId", false, "CAR_ID");
        public final static Property Brand = new Property(2, String.class, "brand", false, "BRAND");
    }


    public CarBeanDao(DaoConfig config) {
        super(config);
    }
    
    public CarBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CAR_BEAN\" (" + //
                "\"NAME\" TEXT," + // 0: name
                "\"CAR_ID\" INTEGER NOT NULL ," + // 1: carId
                "\"BRAND\" TEXT);"); // 2: brand
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CAR_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, CarBean entity) {
        stmt.clearBindings();
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(1, name);
        }
        stmt.bindLong(2, entity.getCarId());
 
        String brand = entity.getBrand();
        if (brand != null) {
            stmt.bindString(3, brand);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, CarBean entity) {
        stmt.clearBindings();
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(1, name);
        }
        stmt.bindLong(2, entity.getCarId());
 
        String brand = entity.getBrand();
        if (brand != null) {
            stmt.bindString(3, brand);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public CarBean readEntity(Cursor cursor, int offset) {
        CarBean entity = new CarBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // name
            cursor.getInt(offset + 1), // carId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // brand
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, CarBean entity, int offset) {
        entity.setName(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setCarId(cursor.getInt(offset + 1));
        entity.setBrand(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(CarBean entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(CarBean entity) {
        return null;
    }

    @Override
    public boolean hasKey(CarBean entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}