package com.soumya.pojo;

import java.sql.Timestamp;

public class EProduct {
        private int ID;
        private String name;
        private double price;
        private Timestamp dateAdded;
        
        public EProduct() {
                
        }
        public EProduct(int id, String name, double price, Timestamp dateAdded) {
                this.ID = id;
                this.name = name;
                this.price = price;
                this.dateAdded = dateAdded;
        }
        
        public int getID() {return this.ID; }
        public String getName() { return this.name;}
        public double getPrice() { return this.price;}
        public Timestamp getDateAdded() { return this.dateAdded;}
        
        public void setID(int id) { this.ID = id;}
        public void setName(String name) { this.name = name;}
        public void setPrice(double price) { this.price = price;}
        public void setDateAdded(Timestamp date) { this.dateAdded = date;}
		@Override
		public String toString() {
			return "EProduct [ID=" + ID + ", name=" + name + ", price=" + price + ", dateAdded=" + dateAdded + "]";
		}
        
        
}


