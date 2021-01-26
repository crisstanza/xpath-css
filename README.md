
XPath and CSS Selectors
=======================

Common CSS Selectors:
---------------------

- #id
- .class
- [attribute-name='value']
- :not([attribute-name=''])
- [^attribute-name-prefix]
- [attribute-value-prefix^=value]
- [attribute-value-suffix$=value]
- [attribute-value-contais*=value]
- [attribute-value-prefix~=regular_expression]
- parent any-child
- parent > direct-child

Common XPath Selectors:
------------------------

- //anywhere
- /here
- //anywhere/text()
- .
- ..
- @

Conclusion:
-----------

- Using XPath and CSS selectors in the same project may lead to some name clashes
- CSS Selector are easier to get a visual representation (in web browser)
- Only XPath can retrieve comments
- XPath Axes and Operators: more power to retrieve content or perform math operations

Links:
------

- https://howtodoinjava.com/xml/java-xpath-tutorial-example/
- https://jsoup.org/cookbook/extracting-data/selector-syntax
