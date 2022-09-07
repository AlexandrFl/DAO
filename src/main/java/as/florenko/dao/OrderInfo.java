package as.florenko.dao;

public class OrderInfo {
    private final String CLIENT_NAME;
    private final String ORDER_NAME;

    public OrderInfo(String clientName, String orderName) {
        this.CLIENT_NAME = clientName;
        this.ORDER_NAME = orderName;
    }

    public String getCLIENT_NAME() {
        return CLIENT_NAME;
    }

    public String getORDER_NAME() {
        return ORDER_NAME;
    }

    public String toString() {
        return "Клиент - " + CLIENT_NAME + " " + "Заказ - " + ORDER_NAME;
    }
}

