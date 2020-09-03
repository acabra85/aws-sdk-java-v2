/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package software.amazon.awssdk.codegen.jmespath.component;

import software.amazon.awssdk.utils.Validate;

public class SubExpressionRight {
    private String identifier;
    private MultiSelectList multiSelectList;
    private MultiSelectHash multiSelectHash;
    private FunctionExpression functionExpression;
    private StarExpression starExpression;

    public static SubExpressionRight identifier(String identifier) {
        Validate.notNull(identifier, "identifier");
        SubExpressionRight result = new SubExpressionRight();
        result.identifier = identifier;
        return result;
    }

    public static SubExpressionRight multiSelectList(MultiSelectList multiSelectList) {
        Validate.notNull(multiSelectList, "multiSelectList");
        SubExpressionRight result = new SubExpressionRight();
        result.multiSelectList = multiSelectList;
        return result;
    }

    public static SubExpressionRight multiSelectHash(MultiSelectHash multiSelectHash) {
        Validate.notNull(multiSelectHash, "multiSelectHash");
        SubExpressionRight result = new SubExpressionRight();
        result.multiSelectHash = multiSelectHash;
        return result;
    }

    public static SubExpressionRight functionExpression(FunctionExpression functionExpression) {
        Validate.notNull(functionExpression, "functionExpression");
        SubExpressionRight result = new SubExpressionRight();
        result.functionExpression = functionExpression;
        return result;
    }

    public static SubExpressionRight starExpression(StarExpression starExpression) {
        Validate.notNull(starExpression, "starExpression");
        SubExpressionRight result = new SubExpressionRight();
        result.starExpression = starExpression;
        return result;
    }


    public boolean isIdentifier() {
        return identifier != null;
    }

    public boolean isMultiSelectList() {
        return multiSelectList != null;
    }

    public boolean isMultiSelectHash() {
        return multiSelectHash != null;
    }

    public boolean isFunctionExpression() {
        return functionExpression != null;
    }

    public boolean isStarExpression() {
        return starExpression != null;
    }

    public String asIdentifier() {
        Validate.validState(isIdentifier(), "Not a String");
        return identifier;
    }

    public MultiSelectList asMultiSelectList() {
        Validate.validState(isMultiSelectList(), "Not a MultiSelectList");
        return multiSelectList;
    }

    public MultiSelectHash asMultiSelectHash() {
        Validate.validState(isMultiSelectHash(), "Not a MultiSelectHash");
        return multiSelectHash;
    }

    public FunctionExpression asFunctionExpression() {
        Validate.validState(isFunctionExpression(), "Not a FunctionExpression");
        return functionExpression;
    }

    public StarExpression asStarExpression() {
        Validate.validState(isStarExpression(), "Not a StarExpression");
        return starExpression;
    }


//    void visit(Visitor visitor);
//
//    interface Visitor {
//        default void visitIdentifier(String identifier) {
//        }
//
//        default void visitMultiSelectList(MultiSelectList multiSelectList) {
//        }
//
//        default void visitMultiSelectHash(MultiSelectHash multiSelectHash) {
//        }
//
//        default void visitFunctionExpression(FunctionExpression functionExpression) {
//        }
//
//        default void visitStarExpression(StarExpression starExpression) {
//        }
//    }
}