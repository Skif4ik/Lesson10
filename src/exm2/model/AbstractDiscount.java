package exm2.model;

public  enum AbstractDiscount {

        UNDISCOUNTED{
            @Override
            public double discount() {
                return 1.0;
            }
        },
        DISCOUNTED{
            @Override
            public double discount() {
                return 0.9;
            }
        },
        REDDISCOUNTED{
            @Override
            public double discount() {
                return 0.75;
            }
        };


        public abstract double discount();
    }
