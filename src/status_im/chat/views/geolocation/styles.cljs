(ns status-im.chat.views.geolocation.styles)

(defn place-item-container [address]
  {:height          (if address 74 52)
   :justify-content :center})

(def place-item-title-container
  {:flex-direction :row
   :align-items    :center})

(def place-item-circle-icon
  {:border-color  "#628fe3"
   :border-width  3
   :border-radius 7
   :height        13
   :width         13})

(def place-item-title
  {:font-size     15
   :padding-left  9
   :padding-right 16
   :color         "#000000"
   :line-height   23})

(def place-item-address
  {:font-size     15
   :padding-left  22
   :padding-right 16
   :color         "#000000"
   :line-height   23})

(def map-activity-indicator-container
  {:align-items     :center
   :justify-content :center
   :height          100})

(def map-view
  {:height 100})

(def location-container
  {:margin-top        11
   :margin-horizontal 16})

(def location-container-title
  {:font-size      14
   :color          "#939ba1"
   :letter-spacing -0.2})

(def separator
  {:height           1
   :margin-left      22
   :opacity          0.5
   :background-color "#c1c7cbb7"})