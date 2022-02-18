package dayeleven.jdbcapp.util;

public interface QueryMapper {
	public static final String GET_CUSTOMER_BY_ID = "select * from customer where customerId=?";
	public static final String GET_ALL_CUSTOMERS= "select * from customer";
	public static final String ADD_CUSTOMER = "INSERT INTO CUSTOMER(customerId,customerName,birthDate,mobile,email) VALUES(?,?,?,?,?)";
	public static final String UPDATE_CUSTOMER="update customer set customerName=?,birthDate=?,mobile=?,email=? where customerId=?";
}
