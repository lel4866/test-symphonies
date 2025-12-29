(defsymphony
 "Test-SPY-QQQ-weight-inverse-volatility"
 {:asset-class "EQUITIES", :rebalance-frequency :daily}
 (weight-inverse-volatility
  15
  [(asset "SPY" "SSgA Active Trust - SPDR S&P 500 ETF Trust")
   (asset "AVGO" "Broadcom Inc")
   (asset
    "QQQ"
    "Invesco Capital Management LLC - Invesco QQQ Trust Series 1")
   (asset "NVDA" "NVIDIA Corp")]))
