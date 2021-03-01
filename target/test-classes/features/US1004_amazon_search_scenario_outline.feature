@wip
Feature: US1004_amazon_search_scenario_outline


    Scenario Outline: TC06_coklu_arama
    When kullanici amazon anasayfaya gider
    And "<arananlar>" icin arama yapar
    Then sonucun "<arananlar>" icerdigini test eder
    And kullanici sayfayi kapatir

      Examples:
      |arananlar|
      |yasin |
      |samsung|
      |headphone|
      |pencil   |