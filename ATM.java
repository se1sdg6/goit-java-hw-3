class ATM {
  public int countBanknotes(int sum) {
        int result = 0;

        if (sum >= 500) {
            int count = 0;
            while (sum >= 500) {
                sum -= 500;
                count++;
            }

            result += count;
        }
        if (sum >= 200) {
            int count = 0;
            while (sum >= 200) {
                sum -= 200;
                count++;
            }

            result += count;
        }
        if (sum >= 100) {
            int count = 0;
            while (sum >= 100) {
                sum -= 100;
                count++;
            }

            result += count;
        }
        if (sum >= 50) {
            int count = 0;
            while (sum >= 50) {
                sum -= 50;
                count++;
            }

            result += count;
        }
        if (sum >= 20) {
            int count = 0;
            while (sum >= 20) {
                sum -= 20;
                count++;
            }

            result += count;
        }
        if (sum >= 10) {
            int count = 0;
            while (sum >= 10) {
                sum -= 10;
                count++;
            }

            result += count;
        }
        if (sum >= 5) {
            int count = 0;
            while (sum >= 5) {
                sum -= 5;
                count++;
            }

            result += count;
        }
        if (sum >= 2) {
            int count = 0;
            while (sum >= 2) {
                sum -= 2;
                count++;
            }

            result += count;
        }
        if (sum >= 1) {
            int count = 0;
            while (sum >= 1) {
                sum -= 500;
                count++;
            }

            result += count;
        }

        return result;
    }
}