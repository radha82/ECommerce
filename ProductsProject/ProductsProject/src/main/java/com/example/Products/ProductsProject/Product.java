package com.example.Products.ProductsProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Products")
public class Product {
	
	
		// Id is necessary for each table to be identified as unique identifier
			@Id
			@Column(name="ID")
			private int productId;
			@Column(name="NAME")
			private String productName;
			@Column(name="description")
			private String productdescription;
			@Column(name="imagepath")
			private String Imagepath;
			@Column(name="category")
			private String PCategory;
			@Column(name="price")
			private String productPrice;
			
			public Product() {
				// TODO Auto-generated constructor stub
			}

			public int getProductId() {
				return productId;
			}

			public void setProductId(int productId) {
				this.productId = productId;
			}

			public String getProductName() {
				return productName;
			}

			public void setProductName(String productName) {
				this.productName = productName;
			}

			public String getProductdescription() {
				return productdescription;
			}

			public void setProductdescription(String productdescription) {
				this.productdescription = productdescription;
			}

			public String getImagepath() {
				return Imagepath;
			}

			public void setImagepath(String imagepath) {
				Imagepath = imagepath;
			}

			public String getPCategory() {
				return PCategory;
			}

			public void setPCategory(String pCategory) {
				PCategory = pCategory;
			}

			public String getProductPrice() {
				return productPrice;
			}

			public void setProductPrice(String productPrice) {
				this.productPrice = productPrice;
			}

			public Product(int productId, String productName, String productdescription, String imagepath,
					String pCategory, String productPrice) {
				super();
				this.productId = productId;
				this.productName = productName;
				this.productdescription = productdescription;
				Imagepath = imagepath;
				PCategory = pCategory;
				this.productPrice = productPrice;
			}
			@Override
			public String toString() {
				return "Product{" + "id=" + this.productId + ", name='" +
						this.productName + "', description='" + this.productdescription + "',Imagepath='"+this.Imagepath+",PCategory='"+this.PCategory+"',productPrice='"+this.productPrice+"'}";

}
}
