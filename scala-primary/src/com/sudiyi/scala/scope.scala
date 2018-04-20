//作用域保护

package bobsrocckets {
  package navigation {
    private [bobsrocckets] class Navigator {
      protected [navigation] def useStarChart(){}

      class LegOfJourney {
        private [Navigator] val distance = 100
      }

      private [this] var speed = 200
    }

    package launch {
      object Vehicle {
        private [launch] val guide = new Navigator
      }
    }
  }
}