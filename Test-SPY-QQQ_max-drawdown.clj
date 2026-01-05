(defsymphony
 "Test_SPY_QQQ_max_drawdown"
 {:asset-class "EQUITIES", :rebalance-frequency :daily}
 (weight-equal
  [(if
    (< (max-drawdown "SPY" {:window 20}) 5)
    [(asset "SPY" "SSgA Active Trust - SPDR S&P 500 ETF Trust")]
    [(asset "TSLA" "Tesla Inc")])]))
