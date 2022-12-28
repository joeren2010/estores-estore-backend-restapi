package estore.com.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the wishlists database table.
 * 
 */
@Entity
@Table(name="wishlists")
@NamedQuery(name="Wishlist.findAll", query="SELECT w FROM Wishlist w")
public class Wishlist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="wishlistid")					//tells springboot to map to wishlistid
	private int wishListId;						//by default: springboot will map this to wish_list_id
	@Column(name="productid")
	private int productId;
	@Column(name="userid")
	private int userId;

	
	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="wishlistid", referencedColumnName="productid", insertable = false, updatable = false)
	private Product product;
	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="wishlistid", referencedColumnName="userid", insertable = false, updatable = false)
	private User user;

	
	public Wishlist() {
	}

	public int getWishListId() {
		return this.wishListId;
	}

	public void setWishListId(int wishListId) {
		this.wishListId = wishListId;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}