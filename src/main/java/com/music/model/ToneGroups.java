/*
 * Computoser is a music-composition algorithm and a website to present the results
 * Copyright (C) 2012-2014  Bozhidar Bozhanov
 *
 * Computoser is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * Computoser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Computoser.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.music.model;

import java.util.Set;

import com.google.common.collect.Sets;

public enum ToneGroups {
    STABLE(ToneType.TONIC, ToneType.MEDIANT, ToneType.DOMINANT),
    UNSTABLE(ToneType.SUPERTONIC, ToneType.SUBDOMINANT, ToneType.SUBMEDIANT, ToneType.LEADING_OR_SUBTONIC),
    TONAL(ToneType.TONIC, ToneType.SUBDOMINANT, ToneType.DOMINANT), MODAL;
    private final Set<ToneType> toneTypes;
    private ToneGroups(ToneType... toneTypes) {
        this.toneTypes = Sets.newHashSet(toneTypes);
    }
    public Set<ToneType> getToneTypes() {
        return toneTypes;
    }
}