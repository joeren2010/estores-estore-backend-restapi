package estore.com.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the orderitems database table.
 * 
 */
@Entity
@Table(name="orderitems")
@NamedQuery(name="Orderitem.findAll", query="SELECT o FROM Orderitem o")
public class Orderitem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="orderitemid")				//tells springboot to map to orderitemid
	private int orderItemId;				//by default: springboot will map this to order_item_id
	@Column(name="orderid")	
	private int orderId;
	private int price;
	@Column(name="productcategory")	
	private String productCategory;
	@Column(name="productcode")	
	private String productCode;
	@Column(name="productdescription")	
	private String productDescription;
	@Column(name="productid")	
	private int productId;
	@Column(name="productimg")	
	private String productImg;
	@Column(name="producttitle")	
	private String productTitle;
	private int quantity;
	@Column(name="totalprice")	
	private int totalPrice;
	
	
	//bi-directional many-to-one association to Order
	@ManyToOne
	@JoinColumn(name="orderitemid", referencedColumnName="orderid", insertable = false, updatable = false)
	private Order order;
	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="orderitemid", referencedColumnName="productid", insertable = false, updatable = false)
	private Product product;

	
	public Orderitem() {
	}

	public int getOrderItemId() {
		return this.orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProductCategory() {
		return this.productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDescription() {
		return this.productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductImg() {
		return this.productImg;
	}

	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}

	public String getProductTitle() {
		return this.productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}