(defsymphony
 "Test-SPY-QQQ_max-drawdown"
 {:asset-class "EQUITIES", :rebalance-frequency :daily}
 (weight-specified
  0.6
  (asset "SPY" "SSgA Active Trust - SPDR S&P 500 ETF Trust")
  0.25
  (asset
   "QQQ"
   "Invesco Capital Management LLC - Invesco QQQ Trust Series 1")
  ##NaN
  (if
   (< (max-drawdown "TSLA" {:window 20}) 10)
   [(asset "TSLA" "Tesla Inc")]
   [(asset "NVDA" "NVIDIA Corp")])
  0.15
  (group
   "Group1"
   [(weight-equal
     [(asset
       "EDZ"
       "Direxion Shares ETF Trust - Direxion Daily MSCI Emerging Markets Bear -3x Shares")
      (asset "GLD" "SPDR Gold Trust - SPDR Gold Shares ETF")
      (if
       (> (rsi "TSLA" {:window 14}) 60)
       [(asset "NVDA" "NVIDIA Corp")]
       [(asset
         "GOOGL" 
         "Alphabet Inc - Ordinary Shares - Class A")])])])))
