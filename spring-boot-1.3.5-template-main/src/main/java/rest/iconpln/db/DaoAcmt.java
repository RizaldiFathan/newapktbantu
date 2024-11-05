package rest.iconpln.db;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DaoAcmt {
	@Qualifier("datasource2")
    @Autowired
    private DataSource dataSource;
}
