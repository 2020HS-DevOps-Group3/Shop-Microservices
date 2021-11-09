import {Component, Input, OnInit} from '@angular/core';
import {Product} from "../../product";

@Component({
  selector: 'app-shopping-cart',
  templateUrl: './shopping-cart.component.html',
  styleUrls: ['./shopping-cart.component.css']
})
export class ShoppingCartComponent implements OnInit {

  @Input()
  products: Product[] | undefined;

  constructor() { }

  ngOnInit(): void {
  }

}
