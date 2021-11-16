export class Product {

  id: string;
  name: string;
  description: string;
  qty: number;
  price: number;
  imageUrl: string;


  constructor(id: string, name: string, description: string = 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Inventore, minima.', qty: number = 0, price: number = 0, imageUrl: string = '') {
    this.id = id;
    this.name = name;
    this.description = description;
    this.qty = qty;
    this.price = price;
    this.imageUrl = imageUrl;
  }
}
