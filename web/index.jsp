<%--
  Created by IntelliJ IDEA.
  User: nguyenha265
  Date: 18/07/2019
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form method="post" action="/index">
    <fieldset style="width: 400px; height: auto">
        <legend><h2>Calculator</h2></legend>
        <table>
            <tr>
                <th>First operand :</th>
                <td><input type="text" name="firstOperand" placeholder="Number"></td>
            </tr>
            <tr>
                <th>Operator :</th>
                <td><select name="select">
                    <option value="addition">ADDITION (+)</option>
                    <option value="subtration">SUBTRACTION (-)</option>
                    <option value="multiplication">MULTIPLICATION (X)</option>
                    <option value="division">DIVISION (/)</option>
                </select></td>
            </tr>
            <tr>
                <th>Second operand :</th>
                <td><input type="text" name="secondOperand" placeholder="Number"></td>
            </tr>
            <tr>
                <th>&nbsp;</th>
                <td><input style="margin-left: 30px" type="submit" id="submit" value="calculate"/></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
