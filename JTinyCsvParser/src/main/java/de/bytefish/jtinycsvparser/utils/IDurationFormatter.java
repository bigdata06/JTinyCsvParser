// Copyright (c) Philipp Wagner. All rights reserved.
// Licensed under the MIT license. See LICENSE file in the project root for full license information.

package de.bytefish.jtinycsvparser.utils;

@FunctionalInterface
public interface IDurationFormatter {

    String toDurationString(String value);

}
