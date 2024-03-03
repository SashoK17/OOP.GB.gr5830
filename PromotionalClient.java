package OOPGr5830.HomeWork;

public class PromotionalClient {
    private static int participantsCount;
    public static int getParticipantsCount() {
        return participantsCount;
    }

    public static void setParticipantsCount(int count) {
        participantsCount = count;
    }
    private String promotionName;

    private int clientId;

    public PromotionalClient(String promotionName) {
        this.promotionName = promotionName;
    }

    public PromotionalClient(int clientId) {
        this.clientId = clientId;
    }

    public PromotionalClient(String promotionName, int clientId) {
        this.promotionName = promotionName;
        this.clientId = clientId;
    }
}

public class PromotionalClient implements iReturnOrder {
    // Поля и конструкторы класса

    @Override
    public boolean initiateReturn(int orderId) {
        // Логика инициирования возврата заказа
        return true; // Пример возвращаемого значения
    }

    @Override
    public boolean processReturn(int orderId) {
        // Логика обработки возврата заказа
        return true; // Пример возвращаемого значения
    }
}
/**
 * Инициирует процесс возврата заказа.
 * 
 * @param orderId идентификатор заказа, который требуется вернуть
 * @return true, если процесс возврата успешно инициирован, в противном случае false
 */
@Override
public boolean initiateReturn(int orderId) {
}
