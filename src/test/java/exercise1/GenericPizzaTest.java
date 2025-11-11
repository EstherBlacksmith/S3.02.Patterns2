package exercise1;

import exercise1.enums.PizzaDough;
import exercise1.enums.PizzaSize;
import exercise1.enums.PizzaType;
import exercise1.genericBuilder.GenericBuilder;
import exercise1.genericBuilder.GenericPizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericPizzaTest {

    @Test
    public void testBuilderCreatePizzaCorrectly() {
        GenericPizza pizza = GenericBuilder.of(GenericPizza::new)
                .with(GenericPizza::setPizzaSize, PizzaSize.FAMILIAR)
                .with(GenericPizza::setPizzaDough, PizzaDough.DENSO)
                .with(GenericPizza::setToppings, "Mushrooms")
                .with(GenericPizza::setToppings, "Formaggio")
                .with(GenericPizza::setPizzaType, PizzaType.GRANAPADANO)
                .build();

        assertNotNull(pizza);
        assertEquals(PizzaType.GRANAPADANO, pizza.getPizzaType());
        assertEquals(PizzaDough.DENSO, pizza.getPizzaDough());
        assertEquals(PizzaSize.FAMILIAR, pizza.getPizzaSize());
        assertTrue(pizza.getToppings().contains("Mushrooms"));
        assertTrue(pizza.getToppings().contains("Formaggio"));


    }

    @Test
    public void testBuilderImmutableByCreatingOneWithoutType() {
        GenericBuilder<GenericPizza> builder = GenericBuilder.of(GenericPizza::new);
        GenericBuilder<GenericPizza> builderWithType = builder.with(GenericPizza::setPizzaType, PizzaType.DIAVOLA);

        GenericPizza pizza1 = builderWithType.build();
        GenericPizza pizza2 = builder.build();

        assertEquals(PizzaType.DIAVOLA, pizza1.getPizzaType());
        assertNull(pizza2.getPizzaType());
    }


}