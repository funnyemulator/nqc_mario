�GSN    �˅1��\7,5V'pcw2toT��6�6e�$<غ�$^h����t�&�N��b�p<�N%�?zw/$֦�v�u����0W�C�}�����iΑ��rj�(�:/�g�a;���?-P��	�2+�\<��v\��꽷C�=o2��3������7����7���?��H4�����zFp��AG2�/#������>����;��ss%���冕��r�d|>{������-~@����S�Rd!iYE����ЋG}��/��u�7  �8ל���C��i�ܵ��L:渌�0�_�^�QW��^Xg��E�{g	�q&�k�^����'g�(���*#�oK�a��$x�ãQ�.�S���+�?a�%G���B����.,���zm�<{�3� ���G����b�{A���r��Rj!<c��a���%�����q3zݽb�^$G.�Z�d����<�ͧL����yۼ�Tk�����?tn3�iQ�q�f�z_,1S(Ą���3 transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = text�re2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,texColor.a);
}

#endif
