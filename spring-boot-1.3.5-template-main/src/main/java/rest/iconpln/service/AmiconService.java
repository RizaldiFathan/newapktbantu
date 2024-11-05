package rest.iconpln.service;

import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import oracle.jdbc.OracleTypes;
import org.apache.commons.io.IOUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;

import rest.iconpln.db.DaoAmicon;
import rest.iconpln.db.DatasourceConfiguration;

@Service
public class AmiconService {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DatasourceConfiguration dataSourceConfig;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(this.dataSourceConfig.dataSource2());
    }

    @Autowired
    private PlsqlServiceAmicon plsqlServiceAmicon;

    // GET DISTRIBUSI
    public Map<String, Object> GET_DISTRIBUSI(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GETDISTRIBUSI", map);
    }
    // END GET DISTRIBUSI

    // GET AREA BY DIS
    public Map<String, Object> GET_AREA_BY_DIST(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_AREA", map);
    }
    // END GET AREA BY DIS

    // GET POSKO BY AREA
    public Map<String, Object> GET_POSKO_BY_AREA(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_UNIT_TYPE5_BYPARENT", map);
    }
    // END GET POSKO BY AREA

    // GET UNIT BY AREA
    public Map<String, Object> GET_UNIT_BY_AREA(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_RAYON", map);
    }
    // END GET UNIT BY AREA

    // GET REGIONAL
    public Map<String, Object> GET_REGIONAL(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_UNIT_REG", map);
    }
    // END GET REGIONAL

    // GET RAYON_BY_AREA
    public Map<String, Object> GET_RAYON_BY_AREA(Map map) throws SQLException {
        return (Map) plsqlServiceAmicon.executeProc("GET_RAYON", map);
    }

}
