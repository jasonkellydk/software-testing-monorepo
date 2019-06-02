class SimpleCalculator: Calculator {
    override fun add(paramOne: Double, paramTwo: Double): Double {
        return paramOne + paramTwo
    }

    override fun subtract(paramOne: Double, paramTwo: Double): Double {
        return paramOne - paramTwo
    }

    override fun divide(paramOne: Double, paramTwo: Double): Double {
        return paramOne / paramTwo
    }

    override fun multiply(paramOne: Double, paramTwo: Double): Double {
        return paramOne * paramTwo
    }
}
