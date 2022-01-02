import {Component, Input, OnInit} from '@angular/core';
import {Product} from "../../../product";
import {ProductService} from "../../../services/product.service";

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  @Input()
  products: Product[] | undefined;

  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    // if (!this.products)
    //   this.products = this.productService.getProducts();
  }
}
