/*
 * Copyright (c) 2012-2013, Credit Suisse
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  * Neither the name of JSR-354 nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package javax.money.ext;

import java.io.Serializable;

/**
 * Defines the different region types available. This allows to segregate
 * different grouping strategy types.
 * 
 * @author Anatole Tresch
 */
public interface RegionType extends Serializable, Comparable<RegionType>{

	/**
	 * Return the type's identifier.
	 * 
	 * @return the unique identifier.
	 */
	public String getId();
	// /** Type representing a continent. */
	// CONTINENT,
	//
	// /** Type representing a sub-continent. */
	// SUBCONTINENT,
	//
	// /**
	// * Type representing a grouping of territories that is not mappable to a
	// * normal WORLD/CONTINENT/SUBCONTINENT/TERRITORY structure, or an
	// arbitrary
	// * user defined grouping.
	// */
	// GROUPING,
	//
	// /** Type representing a territory. */
	// TERRITORY,
	//
	// /** Type representing the unknown region. */
	// UNKNOWN,
	//
	// /** Type representing the whole world. */
	// WORLD

}
