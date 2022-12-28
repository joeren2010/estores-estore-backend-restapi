package estore.com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userid")					//tells springboot to map to userid
	private int userId;						//by default: springboot will map this to user_id
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="addedon")					//tells springboot to map to addedon
	private Date addedOn;					//by default: springboot will map this to added_on
	private String city;
	private BigInteger contact;
	private String country;
	private String email;
	@Column(name="fullname")	
	private String fullName;
	private String image;
	private String password;
	private int pincode;
	private String state;
	private String street;

	
	//bi-directional many-to-one association to Cart
	@OneToMany(mappedBy="user")
	private List<Cart> carts;
	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="user")
	private List<Order> orders;
	//bi-directional many-to-one association to Wishlist
	@OneToMany(mappedBy="user")
	private List<Wishlist> wishlists;

	
	public User() {
	}

	public Date getAddedOn() {
		return this.addedOn;
	}

	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public BigInteger getContact() {
		return this.contact;
	}

	public void setContact(BigInteger contact) {
		this.contact = contact;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPincode() {
		return this.pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public List<Cart> getCarts() {
		return this.carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	public Cart addCart(Cart cart) {
		getCarts().add(cart);
		cart.setUser(this);

		return cart;
	}

	public Cart removeCart(Cart cart) {
		getCarts().remove(cart);
		cart.setUser(null);

		return cart;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Order addOrder(Order order) {
		getOrders().add(order);
		order.setUser(this);

		return order;
	}

	public Order removeOrder(Order order) {
		getOrders().remove(order);
		order.setUser(null);

		return order;
	}

	public List<Wishlist> getWishlists() {
		return this.wishlists;
	}

	public void setWishlists(List<Wishlist> wishlists) {
		this.wishlists = wishlists;
	}

	public Wishlist addWishlist(Wishlist wishlist) {
		getWishlists().add(wishlist);
		wishlist.setUser(this);

		return wishlist;
	}

	public Wishlist removeWishlist(Wishlist wishlist) {
		getWishlists().remove(wishlist);
		wishlist.setUser(null);

		return wishlist;
	}

}