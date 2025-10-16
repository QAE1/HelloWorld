public class Product {


    public enum OrderStatus{
        NEW ("Описание", true),
        PROCESSING ("Описание", true),
        SHIPPED ("Описание", true),
        DELIVERED ("Описание", true),
        CANCELLED ("Описание", true);

        private final String description;
        private final boolean canBeCancelled;

        OrderStatus (String description, Boolean canBeCancelled ){
            this.description = description;
            this.canBeCancelled = canBeCancelled;
        }

        String getDescription(){
            return description;
        }
        Boolean isCanBeCancelled(){
            return canBeCancelled;
        }
        OrderStatus getNextStatus(){
            switch (this){
                case NEW:return PROCESSING;
                case PROCESSING:return SHIPPED;
                case SHIPPED:return DELIVERED;
                case DELIVERED:return CANCELLED;
                default:return CANCELLED;
            }
        }

        static OrderStatus getStatusByDescription(String descp){

            OrderStatus ordres = null;
            for (OrderStatus status:OrderStatus.values()){
                if (status.description==descp){
                    ordres= status;
                }
                else{ordres= null;};
            }
            return ordres;
        }



    }

    public static void main(String[] args) {

        OrderStatus currentStatus = OrderStatus.NEW;
        System.out.println(currentStatus.getDescription());
        currentStatus.isCanBeCancelled();


        currentStatus = currentStatus.getNextStatus();

    }

}
