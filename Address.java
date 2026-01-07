package com.deliveryapp.catchabite.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ADDRESS")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ADDRESS_ID")
	private Long addressId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "APP_USER_ID")
	private AppUser appUser;
}
