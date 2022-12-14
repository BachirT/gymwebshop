import { Product } from "../product-list/models/product.model";

export interface GetResponse {
    _embedded: {products: Product[];
    }
}