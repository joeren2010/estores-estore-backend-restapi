package estore.com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the shipments database table.
 * 
 */
@Entity
@Table(name="shipments")
@NamedQuery(name="Shipment.findAll", query="SELECT s FROM Shipment s")
public class Shipment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="shipmentid")					//tells springboot to map to shipmentid
	private int shipmentId;					//by default: springboot will map this to shipment_id
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="expecteddeliverydate")
	private Date expectedDeliveryDate;
	@Column(name="orderid")
	private int orderId;
	@Column(name="shipmentcompany")
	private String shipmentCompany;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="shipmentdate")
	private Date shipmentDate;
	@Column(name="shipmentmethod")
	private String shipmentMethod;
	@Column(name="shipmentstatus")
	private int shipmentStatus;
	@Column(name="shipmenttitle")
	private String shipmentTitle;
	
	
	//bi-directional many-to-one association to Order
	@ManyToOne
	@JoinColumn(name="shipmentid", referencedColumnName="orderid", insertable = false, updatable = false)
	private Order order;
	
	
	public Shipment() {
	}

	public int getShipmentId() {
		return this.shipmentId;
	}

	public void setShipmentId(int shipmentId) {
		this.shipmentId = shipmentId;
	}

	public Date getExpectedDeliveryDate() {
		return this.expectedDeliveryDate;
	}

	public void setExpectedDeliveryDate(Date expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public String getShipmentCompany() {
		return this.shipmentCompany;
	}

	public void setShipmentCompany(String shipmentCompany) {
		this.shipmentCompany = shipmentCompany;
	}

	public Date getShipmentDate() {
		return this.shipmentDate;
	}

	public void setShipmentDate(Date shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public String getShipmentMethod() {
		return this.shipmentMethod;
	}

	public void setShipmentMethod(String shipmentMethod) {
		this.shipmentMethod = shipmentMethod;
	}

	public int getShipmentStatus() {
		return this.shipmentStatus;
	}

	public void setShipmentStatus(int shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}

	public String getShipmentTitle() {
		return this.shipmentTitle;
	}

	public void setShipmentTitle(String shipmentTitle) {
		this.shipmentTitle = shipmentTitle;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}