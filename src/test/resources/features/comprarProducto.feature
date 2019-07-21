Feature: Search a product on vivanda

  Background:
    Given User is on the vivanda site

  @tag1
  Scenario Outline: Search a product on vivanda
    When The user searches the product
      | <product> |
    And add the product to the shopping cart
    Then The user verifies that the product of the shopping cart is the same one that was selected
      | <product> | <quantity> |

    Examples:
      | product     | quantity |
      | Limón Ácido |        1 |