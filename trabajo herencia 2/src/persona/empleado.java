package persona;

    public class empleado {
        private double saldo;
        private boolean aceptado;

        public void empleado(double dinero) {
            this.saldo = dinero;
        }

        public void ingresar(double dinero) {
            if (dinero > 0) {
                saldo += dinero;
                System.out.println("Se ha ingresado la siguiente cantidad: $ " + dinero);
            }
        }

        public void retirar(double dinero) {
            ajustarLimite(dinero);
            if (aceptado) {
                saldo -= dinero;
            }
        }

        public void ajustarLimite(double retiro) {
            double limite = saldo / 2;
            if (retiro <= limite) {
                System.out.println("se ha retirado exitosamente  la cantidad: $" + retiro);
                aceptado = true;
            } else {
                System.out.println("la maxima cantidad de dinero que se puede retirar es: $" + limite);
                aceptado = false;
            }
        }

        public void cuenta() {
            System.out.println("tu saldo es: " + saldo);
        }

    }