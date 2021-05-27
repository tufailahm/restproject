package com.ust.pms.model;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Setter
@Getter
@NoArgsConstructor		//default
@RequiredArgsConstructor		//default
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Product {
		
		private  @NonNull int productId;
		private String productName;
		private @NonNull int quantityOnHand;
		private @NonNull int price;
	
		
		
}