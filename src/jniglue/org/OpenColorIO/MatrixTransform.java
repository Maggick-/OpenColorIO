/*
Copyright (c) 2003-2010 Sony Pictures Imageworks Inc., et al.
All Rights Reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are
met:
* Redistributions of source code must retain the above copyright
  notice, this list of conditions and the following disclaimer.
* Redistributions in binary form must reproduce the above copyright
  notice, this list of conditions and the following disclaimer in the
  documentation and/or other materials provided with the distribution.
* Neither the name of Sony Pictures Imageworks nor the names of its
  contributors may be used to endorse or promote products derived from
  this software without specific prior written permission.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package org.OpenColorIO;
import org.OpenColorIO.*;

public class MatrixTransform extends Transform
{
    public MatrixTransform() { super(); }
    protected MatrixTransform(long impl) { super(impl); }
    public native MatrixTransform Create();
    public native boolean equals(MatrixTransform obj);
    public native void setValue(float[] m44, float[] offset4);
    public native void getValue(float[] m44, float[] offset4);
    public native void setMatrix(float[] m44);
    public native void getMatrix(float[] m44);
    public native void setOffset(float[] offset4);
    public native void getOffset(float[] offset4);
    public native void Fit(float[] m44, float[] offset4,
                           float[] oldmin4, float[] oldmax4,
                           float[] newmin4, float[] newmax4);
    public native void Identity(float[] m44, float[] offset4);
    public native void Sat(float[] m44, float[] offset4,
                           float sat, float[] lumaCoef3);
    public native void Scale(float[] m44, float[] offset4,
                             float[] scale4);
    public native void View(float[] m44, float[] offset4,
                            int[] channelHot4, float[] lumaCoef3);
}
