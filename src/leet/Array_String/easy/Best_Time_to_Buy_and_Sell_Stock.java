package leet.Array_String.easy;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
      int[] prices = {2,4,1};
      System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int timeToBuy = prices[0];
        int getStartDay = 0;

        for(int i = 1; i < prices.length; i++){ // pegando melhor dia para a compra
            if(prices[i] < timeToBuy){
                timeToBuy = prices[i];
                getStartDay = i;
            }
        }

        int timeToSell = prices[getStartDay];

        for(int i = getStartDay  + 1; i < prices.length; i++){
            if(prices[i] > timeToSell){
                timeToSell = prices[i];
            }
        }

        return  timeToSell - timeToBuy;
    }
}

/*
*
* ACHAR DIA PRA COMPRA (MENOR VALOR) *depois faz as verificações
*
* ITERAR A PARTIR DO DIA DE COMPRA, O PREÇO DA VENDA
*
* RETORNAR CALCULO DO MAIOR
*
* no meu codigo eu so to olhando o maximo valor baseado no menor preço encontrado e no maior preço encontrado,
*  mas eu deveria fazer uma lógica para verificar o maximo lucro indempendente se os preços caem ou sobem
* */