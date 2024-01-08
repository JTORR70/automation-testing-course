Feature: Navigation
    To see the subpages
    Without logging in 
    I can click the navigator bar links

        Scenario Outline: I can access the subpages through the nagigation bar
         Given I navigate to www.freerangetesters.com
         When I go to <section> using the navigation bar
         Examples:
             | section    |
             | Cursos     |
             | Recursos   |
             | Newsletter |
             | Udemy      |
             | Mentorías  |

    @Plans
    Scenario: Los usuarios pueden seleccionar un plan cuando esten logueados
    Given I navigate to www.freerangetesters.com
    When Selecciono un plan
    Then Puedo validar las opciones de los planes