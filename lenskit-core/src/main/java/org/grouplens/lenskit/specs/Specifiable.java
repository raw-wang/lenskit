/*
 * LensKit, an open source recommender systems toolkit.
 * Copyright 2010-2014 LensKit Contributors.  See CONTRIBUTORS.md.
 * Work on LensKit has been funded by the National Science Foundation under
 * grants IIS 05-34939, 08-08692, 08-12148, and 10-17697.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package org.grouplens.lenskit.specs;

import javax.annotation.Nonnull;
import java.util.Map;

/**
 * Interface allowing an object to produce a specification to recreate itself.
 */
public interface Specifiable {
    /**
     * Create a specification for this object.  The return value should be a JSON-like structure,
     * such that wrapping it in {@link com.typesafe.config.ConfigFactory#parseMap(java.util.Map)}
     * and passing it to {@link SpecificationContext#build(Class, com.typesafe.config.Config)} will
     * result in an equivalent object.
     *
     * @return A specification for this object.
     * @param context The context for generating the specification.
     */
    @Nonnull
    Map<String,Object> toSpecification(SpecificationContext context);
}
