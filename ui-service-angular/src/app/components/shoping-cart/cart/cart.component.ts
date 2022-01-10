import {Component, OnInit} from '@angular/core';
import {MessengerService} from "../../../services/messenger.service";
import Swal from "sweetalert2";

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  cartItems: any = [
    // {id: 1, productId:1, productName:'Test1', qty: 8, price:99},
    // {id: 2, productId:2, productName:'Test1', qty: 1, price:1999},
    // {id: 3, productId:3, productName:'Test1', qty: 4, price:149},
    // {id: 4, productId:4, productName:'Test1', qty: 5, price:1499},
  ];

  cartTotal = 0;

  constructor(private messengerService: MessengerService) {
  }

  ngOnInit(): void {
    this.messengerService.getMessage().subscribe((product: any) => {
      this.addToCart(product);
    })
  }

  addToCart(product: any): void {

    let productExists = false;

    for (let productKey in this.cartItems) {
      if (this.cartItems[productKey]?.productId === product?.id) {
        if (this.cartItems[productKey]?.qty)
          this.cartItems[productKey].qty = this.cartItems[productKey]?.qty + 1;
        productExists = true;
        break;
      }
    }

    if (!productExists) {
      this.cartItems.push({
        // id: product?.id,
        productId: product?.id,
        productName: product?.name,
        qty: 1,
        price: product?.price
      })
    }

    this.cartTotal = 0;
    this.cartItems.forEach((item: any) => {
      this.cartTotal += (item?.qty * item?.price);
    })

  }

  order(): void {
    Swal.fire({
      title: 'Success!',
      text: 'You order has been placed successfully',
      icon: 'success',
      confirmButtonText: 'Okay'
    });
  }


}
