package estore.com.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the products database table.
 * 
 */
@Entity
@Table(name="products")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="productid")					//tells springboot to map to productid
	private int productId;						//by default: springboot will map this to product_id
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="addedon")						//tells springboot to map to addedon
	private Date addedOn;						//by default: springboot will map this to added_on
	
	@ElementCollection							//stores a list of values as an entity
	@OrderColumn(name="imageid")				//ensures the order in the column is maintained
	@CollectionTable(name="imageinfo")			//defines the table name
	@Lob										//specifies the datatype "blob" type
	@Column(columnDefinition="LONGBLOB")		//ensures "longblob" is the assigned "blob" type
	private String images[];					//array-field for array-table
	
	private int price;
	@Column(name="productcode")	
	private String productCode;
	@Column(name="productdescription")	
	private String productDescription;
	@Column(name="producttitle")
	private String productTitle;
	private int rating;
	@Column(name="thumbnailimage")
	private int thumbnailImage;

	
	//bi-directional many-to-one association to Cart
	@OneToMany(mappedBy="product")
	private List<Cart> carts;
	//bi-directional many-to-one association to Orderitem
	@OneToMany(mappedBy="product")
	private List<Orderitem> orderitems;
	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;
	//bi-directional many-to-one association to Wishlist
	@OneToMany(mappedBy="product")
	private List<Wishlist> wishlists;

	
	public Product() {
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public Date getAddedOn() {
		return this.addedOn;
	}

	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}

	public String[] getImages() {
		return this.images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
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

	public String getProductTitle() {
		return this.productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public int getRating() {
		return this.rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getThumbnailImage() {
		return this.thumbnailImage;
	}

	public void setThumbnailImage(int thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}

	public List<Cart> getCarts() {
		return this.carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	public Cart addCart(Cart cart) {
		getCarts().add(cart);
		cart.setProduct(this);

		return cart;
	}

	public Cart removeCart(Cart cart) {
		getCarts().remove(cart);
		cart.setProduct(null);

		return cart;
	}

	public List<Orderitem> getOrderitems() {
		return this.orderitems;
	}

	public void setOrderitems(List<Orderitem> orderitems) {
		this.orderitems = orderitems;
	}

	public Orderitem addOrderitem(Orderitem orderitem) {
		getOrderitems().add(orderitem);
		orderitem.setProduct(this);

		return orderitem;
	}

	public Orderitem removeOrderitem(Orderitem orderitem) {
		getOrderitems().remove(orderitem);
		orderitem.setProduct(null);

		return orderitem;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Wishlist> getWishlists() {
		return this.wishlists;
	}

	public void setWishlists(List<Wishlist> wishlists) {
		this.wishlists = wishlists;
	}

	public Wishlist addWishlist(Wishlist wishlist) {
		getWishlists().add(wishlist);
		wishlist.setProduct(this);

		return wishlist;
	}

	public Wishlist removeWishlist(Wishlist wishlist) {
		getWishlists().remove(wishlist);
		wishlist.setProduct(null);

		return wishlist;
	}

	
	//override to-string method
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", addedOn=" + addedOn + ", images=" + Arrays.toString(images)
				+ ", price=" + price + ", productCode=" + productCode + ", productDescription=" + productDescription
				+ ", productTitle=" + productTitle + ", rating=" + rating + ", thumbnailImage=" + thumbnailImage
				+ ", carts=" + carts + ", orderitems=" + orderitems + ", category=" + category + ", wishlists="
				+ wishlists + "]";
	}
}