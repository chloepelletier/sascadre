package projet.cadre.dao;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DataSourceProvider {
	private static MysqlDataSource dataSource;

	public static DataSource getDataSource() {
		if (dataSource == null) {
			dataSource = new MysqlDataSource();
			dataSource.setServerName("s54ham9zz83czkff.cbetxkdyhwsb.us-east-1.rds.amazonaws.com");
			dataSource.setPort(3306);
			dataSource.setDatabaseName("gq399s1c0eutke3v");
			dataSource.setUser("si32jxzhn8ed8v3p");
			dataSource.setPassword("yhq28uf8am4ci5na");
		}
		return dataSource;
	}
}
