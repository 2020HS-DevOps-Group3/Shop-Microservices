import {Component, Input, OnInit} from '@angular/core';
import {MessengerService} from "../../../../services/messenger.service";
import {Product} from "../../../../models/product";

@Component({
  selector: 'app-product-item',
  templateUrl: './product-item.component.html',
  styleUrls: ['./product-item.component.css']
})
export class ProductItemComponent implements OnInit {

  @Input()
  product!: Product;

  constructor(private messengerService:MessengerService) { }

  ngOnInit(): void {
  }

  handlerAddToCart() {
    this.messengerService.sendMessage(this.product);
  }
}
