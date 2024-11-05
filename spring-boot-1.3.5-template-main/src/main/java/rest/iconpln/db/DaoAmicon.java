package rest.iconpln.db;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public interface DaoAmicon {
	
//    @Qualifier("datasource1")
//    @Autowired
//    private DataSource dataSource;
	
	public void updateInteg(String locationCode, String periode);

}
