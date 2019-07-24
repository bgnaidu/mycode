Feature: echo_Steps

    Scenario: Echo messages
      Given variable foo is "bar"
      Then echo "Variable foo=${foo}"