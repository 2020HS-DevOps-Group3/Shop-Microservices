import { Injectable } from '@angular/core';
import {Product} from "../models/product";

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products: Product[] = [
    new Product('1', 'Product 1'),
    new Product('2', 'Product 2'),
    new Product('3', 'Product 3'),
    new Product('4', 'Product 4'),
    new Product('5', 'Product 5'),
  ]

  constructor() { }

  getProducts(): Product[] {
    return this.products;
  }
}
