package behavioural.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();
    public void push(Product product) {
        products.add(product);
    }
    public Iterator creatIterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator <Product> {
        private ProductCollection productCollection;
        private int index;

        public ListIterator(ProductCollection productCollection) {
            this.productCollection = productCollection;
        }

        @Override
        public boolean hasNext() {
            return (index < productCollection.products.size());
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public Product current() {
            return productCollection.products.get(index);
        }
    }

}
